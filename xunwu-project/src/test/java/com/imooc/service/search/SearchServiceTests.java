package com.imooc.service.search;

import com.imooc.ApplicationTests;
import com.imooc.service.ServiceMultiResult;
import com.imooc.service.house.IQiNiuService;
import com.imooc.web.form.RentSearch;
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
        for (Long targetHouseId = 15L; targetHouseId <=21; targetHouseId ++) {
            searchService.index(targetHouseId);
        }
        searchService.index(24L);
    }

    @Test
    public void deleteIndex() {
        Long targetHouseId = 15L;
        searchService.remove(targetHouseId);
    }

    @Test
    public void testQuery() {
        RentSearch rentSearch = new RentSearch();
        rentSearch.setCityEnName("bj");
        rentSearch.setStart(0);
        rentSearch.setSize(10);
        rentSearch.setKeywords("国贸");
        ServiceMultiResult<Long> serviceResult = searchService.query(rentSearch);
        Assert.assertTrue(serviceResult.getTotal() > 0);
    }
}
