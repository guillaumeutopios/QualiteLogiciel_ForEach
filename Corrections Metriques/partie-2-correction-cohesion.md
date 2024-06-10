```java
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        // Logique de création de client
        return customerRepository.save(customer);
    }
}

@Service
public class FinancialCalculatorService {

    public double calculateAverageRevenue(List<Customer> customers) {
        // Logique pour calculer le revenu moyen à partir d'une liste de clients
    }

    public double calculateProfitMargin(List<Customer> customers) {
        // Logique pour calculer la marge bénéficiaire à partir d'une liste de clients
    }
}
```