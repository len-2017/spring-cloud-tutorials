package shuaicj.tutorial.tt72.api1;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign client.
 *
 * @author shuaicj 2017/12/23
 */
@FeignClient(name = "tt72-api-2", path = "/hello")
public interface FeignHello {

    @GetMapping("/")
    String hello(@RequestParam("name") String name);
}
