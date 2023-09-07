package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    private int orderAmount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

}
