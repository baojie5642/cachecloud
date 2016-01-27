package com.sohu.cache.util;

/**
 * User: lingguo
 * Date: 14-5-15
 * Time: 下午11:31
 */
public class ConstUtils {
    // cache的类型区分
    public static final int CACHE_TYPE_MEMCACHED = 1;
    public static final int CACHE_TYPE_REDIS_CLUSTER = 2;
    public static final int CACHE_TYPE_MEMCACHEQ = 3;
    public static final int CACHE_NO_CACHE_CLOUD = 4;
    public static final int CACHE_REDIS_SENTINEL = 5;
    public static final int CACHE_REDIS_STANDALONE = 6;

    // 数据源名称
    public static final String REDIS = "redis";
    public static final String MEMCACHED = "memcached";
    public static final String MACHINE = "machine";

    // memcached job/trigger name/group
    public static final String MEMCACHED_JOB_NAME = "memcachedJob";
    public static final String MEMCACHED_JOB_GROUP = "memcached";
    public static final String MEMCACHED_TRIGGER_GROUP = "memcached-";

    // redis job/trigger name/group
    public static final String REDIS_JOB_NAME = "redisJob";
    public static final String REDIS_JOB_GROUP = "redis";
    public static final String REDIS_TRIGGER_GROUP = "redis-";

    // machine job/trigger name/group
    public static final String MACHINE_JOB_NAME = "machineJob";
    public static final String MACHINE_JOB_GROUP = "machine";
    public static final String MACHINE_TRIGGER_GROUP = "machine-";

    // machine monitor job/trigger name/group
    public static final String MACHINE_MONITOR_JOB_NAME = "machineMonitorJob";
    public static final String MACHINE_MONITOR_JOB_GROUP = "machineMonitor";
    public static final String MACHINE_MONITOR_TRIGGER_GROUP = "machineMonitor-";

    // 心跳检测的频率，由server返回给client
    public static final int HEARTBEAT_INTERVAL_MEMCACHED = 10;
    public static final int HEARTBEAT_INTERVAL_REDIS = 10;

    // http 超时设置
    public static final int HTTP_CONNECTION_TIMEOUT = 3000;
    public static final int HTTP_SOCKET_TIMEOUT = 3000;

    // 创建trigger时，dataMap的数据key
    public static final String HOST_KEY = "host_key";
    public static final String PORT_KEY = "port_key";
    public static final String APP_KEY = "app_key";
    public static final String HOST_ID_KEY = "host_id_key";

    //mysql收集数据的时间字段
    public static final String COLLECT_TIME = "CollectTime";

    // 触发时间
    public static final String TRIGGER_TIME_KEY = "trigger_time_key";

    // 容量转换
    public static final int _1024 = 1024;

    // 机器报警阀值，应该放到数据库中，供动态调整
    public static double CPU_USAGE_RATIO_THRESHOLD = 80.0;
    public static double MEMORY_USAGE_RATIO_THRESHOLD = 80.0;
    public static double LOAD_THRESHOLD = 7.5;


}


