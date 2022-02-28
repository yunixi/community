package com.yunixi.community.service;

import com.yunixi.community.dao.ESDao;
import com.yunixi.community.vo.CommunityVO;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommunityService {

    private final ESDao esDao;

    public List<CommunityVO> getQnaSearchList(CommunityVO communityVO) {
        //해야하는 것
        //일반 키워드 검색부터 진행!

        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();

        QueryBuilder queryBuilder = QueryBuilders.termQuery("qust_title", communityVO.getSearchword());
        sourceBuilder.size(communityVO.getSize()).from(communityVO.getFrom()).query(queryBuilder);
        esDao.esSearchRequest(sourceBuilder);

        return new ArrayList<>();
    }
}
