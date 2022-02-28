package com.yunixi.community.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class CommunityVO {

    private String searchword;

    private int from;
    private int size;
}
