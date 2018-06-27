CREATE TABLE `machine_server` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `ms_name` int(11) DEFAULT NULL COMMENT '机器名称',
  `ms_desc` int(11) DEFAULT NULL COMMENT '机器备注',
  `ms_intranet_list` varchar(200) DEFAULT NULL COMMENT '内网IP列表',
  `ms_outernet_list` varchar(200) DEFAULT NULL COMMENT '外网IP列表',
  `ms_type` int(4) DEFAULT NULL COMMENT '机器类型',
  `ms_port_list` varchar(200) DEFAULT NULL COMMENT '端口使用列表',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;