package com.honghuan.demo.case6;

import lombok.Data;

/**
 * @author honghuan.Liu
 * @date 2024/12/29 下午1:46
 */
@Data
public class Product {
    private productInfo productInfo;
    
    public class productInfo{
        private String productName;

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }
    }
}
