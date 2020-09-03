package com.pangtrue.model.domain;

import com.pangtrue.model.domain.item.Item;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;      //주문 상품

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;    //주문

    private int orderPrice; //주문 가격
    private int count;      //주문 수량

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", buyPrice=" + orderPrice +
                ", count=" + count +
                '}';
    }
}
