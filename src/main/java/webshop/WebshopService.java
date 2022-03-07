package webshop;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class WebshopService {

    private final JdbcTemplate jdbcTemplate;

    public WebshopService(MariaDbDataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> getValuableCustomers() {
        List<String> result = new ArrayList<>();
        jdbcTemplate.query("select customer_name from orders where total > 1000 order by customer_name asc",
                ((rs, i) -> result.add(rs.getString("customer_name"))));

        return result;
    }


}
