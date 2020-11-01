package cn.peng.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;

    private String userId;

    private String commodityCode;

    private Integer count;

    private Integer money;

}
