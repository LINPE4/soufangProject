package com.imooc.service.search;

import com.imooc.ApplicationTests;
import com.imooc.service.house.IQiNiuService;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

/**
 * Created by 瓦力.
 */
public class SearchServiceTests extends ApplicationTests {
    @Autowired
    private ISearchService searchService;

    @Test
    public void testIndex() {
        Long targetHouseId = 15L;
        searchService.index(targetHouseId);
    }

    @Test
    public void deleteIndex() {
        Long targetHouseId = 15L;
        searchService.remove(targetHouseId);
    }


}
