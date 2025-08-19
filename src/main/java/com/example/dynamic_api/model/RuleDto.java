package com.example.dynamic_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RuleDto {
    private Info info;
    private List<Object> vars;
    private Object request;
    private Object response;
    private List<Process> process;
    private List<Sub> subs;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Info {
        private String serviceId;
        private String version;
        private String path;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Process {
        private String label;
        private List<Object> process;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Sub {
        private String subId;
        private String label;
        private List<Object> process;
    }
}
