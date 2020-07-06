/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : comprehensive_alarm

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2020-07-06 23:58:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for alarm_bussiness
-- ----------------------------
DROP TABLE IF EXISTS `alarm_bussiness`;
CREATE TABLE `alarm_bussiness` (
  `alarm_bussiness_id` varchar(255) NOT NULL,
  `alarm_bussiness_name` varchar(255) NOT NULL,
  `scene_id` varchar(255) NOT NULL,
  PRIMARY KEY (`alarm_bussiness_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for alarm_code
-- ----------------------------
DROP TABLE IF EXISTS `alarm_code`;
CREATE TABLE `alarm_code` (
  `alarm_code_id` varchar(20) NOT NULL,
  `alarm_code_name` varchar(255) NOT NULL,
  `level` varchar(10) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `min_threshold` int(11) DEFAULT NULL,
  `max_threshold` int(11) DEFAULT NULL,
  `scene_id` varchar(255) NOT NULL,
  `threshold` text,
  PRIMARY KEY (`alarm_code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for alarm_info
-- ----------------------------
DROP TABLE IF EXISTS `alarm_info`;
CREATE TABLE `alarm_info` (
  `alarm_id` varchar(255) NOT NULL,
  `alarm_title` varchar(255) NOT NULL,
  `alarm_time` datetime NOT NULL,
  `alarm_code_id` varchar(20) NOT NULL,
  `alarm_status` varchar(5) NOT NULL,
  `scene_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `workorder_id` varchar(255) NOT NULL,
  `monitor_type` varchar(255) NOT NULL,
  `origin` varchar(255) NOT NULL,
  PRIMARY KEY (`alarm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for alarm_scene
-- ----------------------------
DROP TABLE IF EXISTS `alarm_scene`;
CREATE TABLE `alarm_scene` (
  `scene_id` varchar(255) NOT NULL,
  `scene_name` varchar(255) NOT NULL,
  PRIMARY KEY (`scene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dispatch_record
-- ----------------------------
DROP TABLE IF EXISTS `dispatch_record`;
CREATE TABLE `dispatch_record` (
  `workorder_id` varchar(255) NOT NULL,
  `way` int(11) DEFAULT NULL,
  `success` int(11) DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`workorder_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for d_outdeviceinfo
-- ----------------------------
DROP TABLE IF EXISTS `d_outdeviceinfo`;
CREATE TABLE `d_outdeviceinfo` (
  `ID` varchar(32) NOT NULL,
  `DEVICEID` varchar(20) NOT NULL,
  `DEVICENAME` varchar(128) NOT NULL,
  `MANUFACTURER` varchar(80) DEFAULT NULL,
  `MODEL` varchar(80) DEFAULT NULL,
  `OWNER` varchar(80) DEFAULT NULL,
  `PASSWORD` varchar(32) DEFAULT NULL,
  `CIVILCODE` varchar(8) NOT NULL,
  `BLOCK` varchar(12) DEFAULT NULL,
  `LONGITUDE` double(38,6) DEFAULT NULL,
  `LATITUDE` double(38,6) DEFAULT NULL,
  `ADDRESS` varchar(300) DEFAULT NULL,
  `PARENTID` varchar(20) DEFAULT NULL,
  `SAFETYWAY` int(12) DEFAULT NULL,
  `REGISTERWAY` int(12) DEFAULT NULL,
  `CERTNUM` varchar(32) DEFAULT NULL,
  `CERTIFICATE` blob,
  `CERTIFIABLE` int(12) DEFAULT NULL,
  `ERRCODE` int(12) DEFAULT NULL,
  `ENDTIME` datetime DEFAULT NULL,
  `SECRECY` int(12) DEFAULT NULL,
  `DEVICETYPE` varchar(2) DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  `STATUS` varchar(10) NOT NULL,
  `SOURCECENTER` varchar(200) DEFAULT NULL,
  `ISWITHCHILD` varchar(1) DEFAULT NULL,
  `CAMERATYPE` varchar(1) DEFAULT NULL,
  `PTZTYPE` varchar(1) DEFAULT NULL,
  `POSITIONTYPE` varchar(2) DEFAULT NULL,
  `ROOMTYPE` varchar(1) DEFAULT NULL,
  `USETYPE` varchar(1) DEFAULT NULL,
  `SUPPLYLIGHTTYPE` varchar(1) DEFAULT NULL,
  `DIRECTIONTYPE` varchar(1) DEFAULT NULL,
  `IP` varchar(15) DEFAULT NULL,
  `STREAMENCRYPT` varchar(1) DEFAULT NULL,
  `ISCOLLECTED` varchar(1) DEFAULT NULL,
  `OFFLINE_TIME` varchar(255) DEFAULT NULL,
  KEY `D_CIVILCODE` (`CIVILCODE`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for e_task_result
-- ----------------------------
DROP TABLE IF EXISTS `e_task_result`;
CREATE TABLE `e_task_result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `DEVICEID` varchar(20) NOT NULL COMMENT '设备ID',
  `DEVICENAME` varchar(128) NOT NULL COMMENT '设备名称',
  `DIAGTIME` datetime DEFAULT NULL COMMENT '检测时间',
  `VQDSTATE` varchar(32) DEFAULT NULL COMMENT '视频质量诊断结果状态，取值0表示正常； 1表示报警；当检测到报警后，即表示对应VqdRes字段中有检测项（信号缺失、清晰度等）分值小于60',
  `ONLINESTATE` varchar(32) DEFAULT NULL COMMENT '设备在线状态 0 在线 1 离线',
  `ISMODIFIED` int(1) DEFAULT NULL COMMENT '是否调整设备状态',
  `TASKID` varchar(40) NOT NULL COMMENT '任务ID',
  `TASKNO` int(11) NOT NULL COMMENT '任务序号',
  `CURREPEATNUM` int(5) DEFAULT NULL COMMENT '当前轮数',
  `CIVILCODE` varchar(20) NOT NULL COMMENT '行政区划',
  `SIPDELAY` int(11) DEFAULT NULL COMMENT '信令时延，单位毫秒，0为程序异常，904为信令超时，其他为响应时长',
  `STREAMDELAY` int(11) DEFAULT NULL COMMENT '码流时延时长，单位毫秒,0为程序异常，905为码流超时,其他为响应时长',
  `IFRAMEDELAY` int(11) DEFAULT NULL COMMENT '关键帧时延，单位毫秒，0为程序异常，926为关键帧超时，其他为响应时长',
  `PLATFORMID` varchar(32) DEFAULT NULL COMMENT '设备所属平台ID',
  `CAPPIC` varchar(255) DEFAULT NULL COMMENT '返回诊断图片路径URL',
  `ERRCODE` varchar(32) DEFAULT NULL COMMENT '表示该设备是否正常进行诊断，完成正常诊断返回200，当诊断异常时返回诊断错误码',
  `VQDRES` varchar(128) DEFAULT NULL COMMENT '视频质量分值：信号缺失|画面偏色|清晰度故障|亮度|条纹干扰|雪花干扰|场景变换|画面冻结|PTZ速度|云台控制失效|人为遮挡''  200：未检测 0-100，有诊断结果 60分以下为异常，60分以上正常，80分以上为优  ',
  `PRESERVING1` varchar(255) DEFAULT NULL COMMENT '预留字段1',
  `PRESERVING2` varchar(255) DEFAULT NULL COMMENT '预留字段2',
  `ALARM_CODE` varchar(255) DEFAULT NULL COMMENT '告警类型编码',
  `OFFLINE_TIME` int(11) DEFAULT NULL COMMENT '设备离线时长',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `E_TASK_RESULT_CODE_TASKNO` (`CIVILCODE`,`TASKNO`) USING BTREE,
  KEY `E_TASK_RESULT_TASKNO` (`TASKNO`) USING BTREE,
  KEY `E_TASK_RESULT_DEVICEID` (`DEVICEID`) USING BTREE,
  KEY `E_TASK_RESULT_DEVICEID_TASKNO` (`DEVICEID`,`TASKNO`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='考核任务结果表';

-- ----------------------------
-- Table structure for knowledge
-- ----------------------------
DROP TABLE IF EXISTS `knowledge`;
CREATE TABLE `knowledge` (
  `id` varchar(255) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `scene_id` varchar(255) DEFAULT NULL,
  `alarm_codes` varchar(255) DEFAULT NULL,
  `origin_flag` int(11) DEFAULT NULL,
  `share_num` int(11) DEFAULT NULL,
  `search_num` int(11) DEFAULT NULL,
  `feedback_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for knowledge_temp
-- ----------------------------
DROP TABLE IF EXISTS `knowledge_temp`;
CREATE TABLE `knowledge_temp` (
  `id` varchar(255) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `scene_id` varchar(255) DEFAULT NULL,
  `alarm_codes` varchar(255) DEFAULT NULL,
  `abandon` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for workorder
-- ----------------------------
DROP TABLE IF EXISTS `workorder`;
CREATE TABLE `workorder` (
  `workorder_id` varchar(255) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `alarm_codes` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `contact_person` varchar(255) DEFAULT NULL,
  `contact_org` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `feedback` varchar(255) DEFAULT NULL,
  `knowledge_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`workorder_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for workorder_flow
-- ----------------------------
DROP TABLE IF EXISTS `workorder_flow`;
CREATE TABLE `workorder_flow` (
  `workorder_id` varchar(255) NOT NULL,
  `contact_person` varchar(255) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`workorder_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for workorder_template
-- ----------------------------
DROP TABLE IF EXISTS `workorder_template`;
CREATE TABLE `workorder_template` (
  `template_id` varchar(255) NOT NULL,
  `template` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`template_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for workorder_type
-- ----------------------------
DROP TABLE IF EXISTS `workorder_type`;
CREATE TABLE `workorder_type` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `scene_ids` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
