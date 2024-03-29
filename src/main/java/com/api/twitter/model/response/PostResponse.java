package com.api.twitter.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
    private String id;
    private Date createdAt;
    private String userId;
    private String username;
    private String content;
    private byte[] profilePicture;
    private boolean hasLiked;
    private long likeCount;
    private long commentCount;
}
