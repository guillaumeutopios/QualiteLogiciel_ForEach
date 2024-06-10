```java
@RestController
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder(@RequestBody Order order, @RequestParam Long customerId) {
        Optional<Customer> customerOptional = customerRepository.findById(customerId);
        if (customerOptional.isPresent()) {
            order = prepareOrder(order, customerOptional.get());
            Order savedOrder = orderRepository.save(order);
            return ResponseEntity.ok(savedOrder);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    private Order prepareOrder(Order order, Customer customer) {
        order.setCustomer(customer);
        order.setDate(new Date());
        order.setStatus("CREATED");
        return order;
    }
}
```