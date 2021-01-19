package com.graphql.StudentGraphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentPayload {
    private PayloadStatus payloadStatus;
}
