package hellospring.demo;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * @description:
 * @author: Evelyn
 * @date: 2020-09-23 22:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HttpTest {

    CloseableHttpClient httpClient;

    @Before
    public void init() {
        httpClient = HttpClients.createDefault();
    }

    @Test
    public void testGet() throws IOException {
        HttpGet request = new HttpGet("https://www.baidu.com");
        String execute = this.httpClient.execute(request, new BasicResponseHandler());
        System.out.println(execute);
    }
}
