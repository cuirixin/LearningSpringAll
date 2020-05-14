[教程](http://www.chilangedu.com/sectionq/1118952106/1F43D55A5653708C)

# Docker安装
```shell script
docker pull rabbitmq:3-management
docker run -d -p 5672:5672 -p 15672:15672 --name myrabbitmq rabbitmq:3-management
```

# 创建exchange、queue，绑定路由键
```shell script
http://192.168.33.10:15672/
guest guest

创建Exchange: direct.demo和fanout.demo
创建Queue: queue.demo
```

