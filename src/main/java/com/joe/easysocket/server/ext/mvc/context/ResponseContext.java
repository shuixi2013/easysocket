package com.joe.easysocket.server.ext.mvc.context;

import com.joe.easysocket.server.ext.mvc.data.BaseDTO;
import com.joe.easysocket.server.ext.mvc.coder.WriterInterceptor;
import lombok.Data;

@Data
public class ResponseContext {
    // 响应对象
    private Response response = null;
    // 响应数据编码器
    private WriterInterceptor writer;

    public ResponseContext() {
        this.response = new Response();
    }

    @Data
    public static class Response {
        /*
         * 请求结果
         */
        private Object result;

        private Response() {

        }

        /**
         * 构建一个无数据的简单响应
         *
         * @return 没有业务数据的简单响应（result是一个BaseDTO）
         */
        public static Response buildOk() {
            Response response = new Response();
            response.setResult(BaseDTO.buildSuccess());
            return response;
        }

        /**
         * 构建一个系统异常响应
         *
         * @return 系统异常响应
         */
        public static Response buildError() {
            Response response = new Response();
            response.setResult(BaseDTO.buildError());
            return response;
        }

        /**
         * 构建一个自定义响应
         *
         * @param result 响应结果
         * @return 自定义响应
         */
        public static Response build(Object result) {
            Response response = new Response();
            response.setResult(result);
            return response;
        }
    }
}
