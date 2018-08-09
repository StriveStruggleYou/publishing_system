CREATE TABLE `app_env` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `app_id` int(11) DEFAULT NULL,
  `env_type` int(11) DEFAULT NULL,
  `jump_ms_id` int(11) DEFAULT NULL,
  `pack_ms_id` int(11) DEFAULT NULL,
  `publish_ms_list` varchar(200) DEFAULT NULL COMMENT '可能是一个机器集群',
  `publish_ms_port` varchar(20) DEFAULT NULL,
  `rollback_ms_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;