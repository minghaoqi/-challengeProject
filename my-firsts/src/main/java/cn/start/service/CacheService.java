package cn.start.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
* Created by haoz1w0w@126.com on 2017-03-28 10:26:13.
*/
@Service
public class CacheService {

/***
* 测试缓存是否生效
* @return
*/
@Cacheable(value = "myCache",key = "#key")
public String testCache(String key){
System.out.println("第一次调用会会打印此语句-------");
return "cache test success !!!";
}
}