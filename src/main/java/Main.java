import entity.Member;
import entity.Order;
import entity.Product;

public class Main {

    public static void main(String[] args) {

    }

    public void save() {
        Member member1 = new Member();
        member1.setId("member1");
        member1.setUsername("회원1");
        em.persist(member1);

        Product productA = new Product();
        product.setId("productA");
        product.setName("상품1");
        em.persist(productA);

        Order order1 = new Order();
        order1.setMember(member1);
        order1.setProduct(productA);
        order1.setOrderAmount(2);
        em.persist(order1);
    }

    public void find() {

        Long orderId = 1L;
        Order order = em.find(Order.class, orderId);

        Member member = order.getMember();
        Product product = order.getProduct();
    }
}
