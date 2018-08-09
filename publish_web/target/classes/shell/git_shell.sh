#!/bin/bash
pack_path="/home/admin/packing/"


function help(){
  echo "init projec_name git_address\r\n"
  echo "switch projec_name branch_name\r\n"

}

function init(){
  echo "-------init start--------"
  git_file=${pack_path}$1
  if [ -d "$git_file" ];then
    echo "$git_file is exist"
    exit 0
  else
    git clone $2
  fi
  echo "-------init end----------"
}

function switch_branch(){
  echo "-------switch_branch start--------"
  cd ${pack_path}$1
  git pull
  git checkout $2
  git pull
  echo "-------switch_branch end--------"
}

#校验参数信息
if [ $# == 0 ]; then
    help
    exit 0
fi

#执行初始化动作
if [ $1 == "init" ]; then
    if [ $# != 3 ]; then
        help
        exit 0
    fi
    init $2 $3
    exit 0
fi


#执行项目分支切换动作动作
if [ $1 == "switch" ]; then
    if [ $# != 3 ]; then
        help
        exit 0
    fi
    switch_branch $2 $3
    exit 0
fi















