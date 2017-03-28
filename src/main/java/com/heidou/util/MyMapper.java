package com.heidou.util;


/**
 * 继承自己的MyMapper
 * @author heidou.f
 *         2017/3/25.

public interface MyMapper<T> extends Mapper<T>,MySqlMapper {

    // 特别注意，该接口不能被扫描到，否则会出错
}
*/