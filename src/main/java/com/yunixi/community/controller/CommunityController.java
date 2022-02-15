package com.yunixi.community.controller;

import com.yunixi.community.service.CommunityService;
import com.yunixi.community.vo.CommunityVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CommunityController {

    private final CommunityService communityService;

    @RequestMapping("/qna_list")
    public ResponseEntity<List> getQnaSearchList(@ModelAttribute CommunityVO communityVO) {
        List<CommunityVO> resultList = communityService.getQnaSearchList(communityVO);
        try {
            return ResponseEntity.ok(resultList);
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }
    }
}
