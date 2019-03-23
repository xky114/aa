package service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ Author :许孔妤
 * @ Date :Created in 18:00 2019/3/20
 * @ Description:公共的接口提供的方法
 */
public interface GongService {
    @RequestMapping("/test")
    String mess(@RequestParam("name") String name );
}
