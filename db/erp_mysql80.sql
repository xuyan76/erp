/*
Navicat MySQL Data Transfer

Source Server         : localhost80
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : erp

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2024-06-15 03:32:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bus_brand
-- ----------------------------
DROP TABLE IF EXISTS `bus_brand`;
CREATE TABLE `bus_brand` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `create_by` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='品牌';

-- ----------------------------
-- Records of bus_brand
-- ----------------------------

-- ----------------------------
-- Table structure for bus_contract
-- ----------------------------
DROP TABLE IF EXISTS `bus_contract`;
CREATE TABLE `bus_contract` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '流水号',
  `code` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '合同编码',
  `create_by` bigint(20) NOT NULL COMMENT '建档人',
  `create_time` datetime DEFAULT NULL COMMENT '建档时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='合同';

-- ----------------------------
-- Records of bus_contract
-- ----------------------------

-- ----------------------------
-- Table structure for bus_contract_item
-- ----------------------------
DROP TABLE IF EXISTS `bus_contract_item`;
CREATE TABLE `bus_contract_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `contract_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of bus_contract_item
-- ----------------------------

-- ----------------------------
-- Table structure for bus_order
-- ----------------------------
DROP TABLE IF EXISTS `bus_order`;
CREATE TABLE `bus_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `orderNo` varchar(64) COLLATE utf8mb4_bin NOT NULL,
  `type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '订单类型：1销售订单 2预付款订单 3退货订单',
  `orgId` int(11) NOT NULL,
  `orderTime` datetime NOT NULL,
  `source` tinyint(4) NOT NULL DEFAULT '1' COMMENT '订单来源',
  `source_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '来源关联号',
  `app_id` int(11) DEFAULT NULL,
  `deviceId` int(11) NOT NULL,
  `cashier` int(11) NOT NULL,
  `prints` tinyint(4) DEFAULT '1' COMMENT '小票打印次数',
  `refund_status` tinyint(4) DEFAULT '1' COMMENT '退货状态：1未退货 2部份退货 3完全退货',
  `refund_order_id` bigint(20) DEFAULT NULL COMMENT '退货原订单ID',
  `refund_reson` varchar(1024) COLLATE utf8mb4_bin DEFAULT NULL,
  `member_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `inx_orderno` (`orderNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单';

-- ----------------------------
-- Records of bus_order
-- ----------------------------

-- ----------------------------
-- Table structure for bus_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `bus_order_detail`;
CREATE TABLE `bus_order_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` bigint(20) NOT NULL,
  `sortno` tinyint(4) DEFAULT '1',
  `org_id` int(11) NOT NULL,
  `product_id` bigint(20) NOT NULL,
  `bar_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `goods_name` varchar(1024) COLLATE utf8mb4_bin NOT NULL,
  `unit` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '单位',
  `price` decimal(16,4) DEFAULT NULL,
  `qty` decimal(16,4) NOT NULL DEFAULT '0.0000',
  `discount` decimal(16,4) DEFAULT '0.0000' COMMENT '折扣金额',
  `amount` decimal(16,4) NOT NULL DEFAULT '0.0000' COMMENT '折扣后含税金额',
  `tax_rate` decimal(16,4) DEFAULT '0.0000' COMMENT '销项税率',
  `tax` decimal(16,4) DEFAULT '0.0000' COMMENT '税额',
  `salesman` int(11) DEFAULT NULL COMMENT '营业员',
  `refund_qty` decimal(16,4) DEFAULT '0.0000' COMMENT '已退数量',
  `refund_amount` decimal(16,4) DEFAULT '0.0000' COMMENT '已退货金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of bus_order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for bus_order_pay
-- ----------------------------
DROP TABLE IF EXISTS `bus_order_pay`;
CREATE TABLE `bus_order_pay` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` bigint(20) NOT NULL,
  `pay_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '支付类型 1普通 2定金 2尾款',
  `pay_style` tinyint(4) DEFAULT NULL,
  `pay_amout` decimal(16,4) NOT NULL DEFAULT '0.0000',
  `transaction_id` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `change` decimal(16,4) DEFAULT '0.0000',
  `pay_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `inx_pay` (`order_id`,`pay_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of bus_order_pay
-- ----------------------------

-- ----------------------------
-- Table structure for bus_product
-- ----------------------------
DROP TABLE IF EXISTS `bus_product`;
CREATE TABLE `bus_product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(1024) COLLATE utf8mb4_bin NOT NULL,
  `category_id` int(11) DEFAULT NULL COMMENT '商品分类ID',
  `brand_id` bigint(20) NOT NULL,
  `create_by` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `unit` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '单位',
  `area` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '产地',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of bus_product
-- ----------------------------

-- ----------------------------
-- Table structure for bus_product_barcode
-- ----------------------------
DROP TABLE IF EXISTS `bus_product_barcode`;
CREATE TABLE `bus_product_barcode` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `good_id` bigint(20) NOT NULL,
  `bar_code` varchar(128) COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of bus_product_barcode
-- ----------------------------

-- ----------------------------
-- Table structure for bus_product_category
-- ----------------------------
DROP TABLE IF EXISTS `bus_product_category`;
CREATE TABLE `bus_product_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `desc` varchar(1024) COLLATE utf8mb4_bin DEFAULT NULL,
  `ico` varchar(1024) COLLATE utf8mb4_bin DEFAULT NULL,
  `sort_no` int(11) NOT NULL DEFAULT '1' COMMENT '排序号',
  `parent_id` int(11) NOT NULL,
  `keywords` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '关键字',
  `status` tinyint(4) NOT NULL DEFAULT '1',
  `ratio` int(11) DEFAULT '1' COMMENT '积分比率',
  `create_by` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='商品分类';

-- ----------------------------
-- Records of bus_product_category
-- ----------------------------

-- ----------------------------
-- Table structure for cms_level
-- ----------------------------
DROP TABLE IF EXISTS `cms_level`;
CREATE TABLE `cms_level` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '1',
  `sort_no` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of cms_level
-- ----------------------------

-- ----------------------------
-- Table structure for cms_member
-- ----------------------------
DROP TABLE IF EXISTS `cms_member`;
CREATE TABLE `cms_member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(256) COLLATE utf8mb4_bin NOT NULL COMMENT '会员卡号',
  `source` tinyint(4) NOT NULL DEFAULT '1' COMMENT '来源',
  `reg_time` datetime NOT NULL,
  `level_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='会员信息';

-- ----------------------------
-- Records of cms_member
-- ----------------------------

-- ----------------------------
-- Table structure for cms_member_third
-- ----------------------------
DROP TABLE IF EXISTS `cms_member_third`;
CREATE TABLE `cms_member_third` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_id` bigint(20) NOT NULL,
  `third_id` int(11) NOT NULL,
  `open_id` varchar(1024) COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of cms_member_third
-- ----------------------------

-- ----------------------------
-- Table structure for cms_point_rule
-- ----------------------------
DROP TABLE IF EXISTS `cms_point_rule`;
CREATE TABLE `cms_point_rule` (
  `id` int(11) NOT NULL,
  `type` tinyint(4) NOT NULL,
  `org_id` bigint(20) NOT NULL,
  `affect_id` bigint(20) DEFAULT NULL,
  `valid_start` datetime DEFAULT NULL,
  `valid_end` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='会员积分规则';

-- ----------------------------
-- Records of cms_point_rule
-- ----------------------------

-- ----------------------------
-- Table structure for sys_app
-- ----------------------------
DROP TABLE IF EXISTS `sys_app`;
CREATE TABLE `sys_app` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `source` tinyint(4) NOT NULL DEFAULT '1',
  `client_id` varchar(64) COLLATE utf8mb4_bin DEFAULT NULL,
  `client_security` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `status` tinyint(4) DEFAULT '1',
  `create_by` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_by` int(11) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `inx_clientid` (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sys_app
-- ----------------------------
INSERT INTO `sys_app` VALUES ('1', '这是我的第一次尝试', '1', null, null, '1', '1', '2024-06-08 04:33:38', null, null);
INSERT INTO `sys_app` VALUES ('2', '这是我的第一次尝试', '1', null, null, '1', '1', '2024-06-08 04:38:30', null, null);
INSERT INTO `sys_app` VALUES ('4', '这是我的第一次尝试', '1', null, null, '1', '1', '2024-06-08 04:47:10', null, null);
INSERT INTO `sys_app` VALUES ('8', '这是我的第一次尝试', '1', null, null, '1', '1', '2024-06-08 04:55:30', null, null);

-- ----------------------------
-- Table structure for sys_app_whitelist
-- ----------------------------
DROP TABLE IF EXISTS `sys_app_whitelist`;
CREATE TABLE `sys_app_whitelist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `app_id` int(11) NOT NULL,
  `ip_address` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sys_app_whitelist
-- ----------------------------
INSERT INTO `sys_app_whitelist` VALUES ('1', '4', '4');
INSERT INTO `sys_app_whitelist` VALUES ('2', '8', '8');

-- ----------------------------
-- Table structure for sys_org
-- ----------------------------
DROP TABLE IF EXISTS `sys_org`;
CREATE TABLE `sys_org` (
  `id` bigint(20) NOT NULL,
  `short_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `full_name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `org_type` int(11) DEFAULT NULL,
  `address` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `fax` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `geo_hash` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `parent_id` bigint(20) NOT NULL,
  `cas_code` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `create_by` bigint(20) NOT NULL,
  `create_time` datetime(6) DEFAULT NULL,
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime(6) DEFAULT NULL,
  `desc` varchar(1024) COLLATE utf8mb4_bin DEFAULT NULL,
  `order_no` int(11) DEFAULT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sys_org
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `dashboard` varchar(128) COLLATE utf8mb4_bin DEFAULT NULL,
  `status` tinyint(4) DEFAULT '1',
  `desc` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `create_by` bigint(20) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_third
-- ----------------------------
DROP TABLE IF EXISTS `sys_third`;
CREATE TABLE `sys_third` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `status` tinyint(4) DEFAULT '1',
  `logo` varchar(1024) COLLATE utf8mb4_bin DEFAULT NULL,
  `ico` varchar(1024) COLLATE utf8mb4_bin DEFAULT NULL,
  `desc` varchar(1024) COLLATE utf8mb4_bin DEFAULT NULL,
  `create_by` bigint(20) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_by` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sys_third
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '流水号',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '人员编码',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '姓名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '登录密码',
  `email` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'email',
  `mobile` varchar(64) COLLATE utf8mb4_bin DEFAULT NULL,
  `org_id` int(11) NOT NULL COMMENT '所属组织',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态',
  `create_by` bigint(20) NOT NULL COMMENT '建档人',
  `create_time` datetime(6) NOT NULL COMMENT '建档时间',
  `update_by` bigint(20) DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(6) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `INX_CODE` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户信息';

-- ----------------------------
-- Records of sys_user
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
