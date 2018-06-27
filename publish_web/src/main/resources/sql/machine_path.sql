CREATE TABLE `machine_path` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `ms_path_name` varchar(100) DEFAULT NULL COMMENT '路径key',
  `ms_path` varchar(500) DEFAULT NULL COMMENT '机器实际路径',
  `ms_desc` varchar(100) DEFAULT NULL COMMENT '路径描述',
  `ms_type` int(4) DEFAULT NULL COMMENT '属于哪种机器类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;