package com.example.dynamic_api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InfoDto {
    private String path;
    private String method;
    private String serviceId;
    private String version;
    private String versionId;
}
