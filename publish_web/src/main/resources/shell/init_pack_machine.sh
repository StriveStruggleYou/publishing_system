#!/bin/bash

#1.shell判断文件,目录是否存在或者具有权限
pack_file="/home/admin/packing"
# -x 参数判断 $folder 是否存在并且是否具有可执行权限
if [ ! -x "$pack_file" ]; then
  mkdir -p "$pack_file"
  echo "create home/admin/packing success"
else
  echo "create pack_file fail"
  exit 1
fi
#2.执行git 命令 如果 不存在就下载
git_exsit=`git --version`

if [[ "$git_exsit" =~ ^git.* ]]; then
    echo "yes you have git"
else
    echo "install git start。。。。。。"
    yum install git -y
    echo "install git end。。。。。。"
fi
ssh_key=`cat ~/.ssh/id_rsa.pub`
if [[ "$ssh_key" =~ ^ssh-rsa.* ]]; then
  echo "$ssh_key"
else
 #生成ssh_key
 ssh-keygen -t rsa -P '' -f ~/.ssh/id_rsa
 ssh_key=`cat ~/.ssh/id_rsa.pub`
 echo "$ssh_key"
fi

#检查JDK是否安装,使用yum安装，使用本地安装


#检查Maven 是否安装





