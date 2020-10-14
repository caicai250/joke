package com.caicai.joke.services.impl;

import com.caicai.joke.domain.Joke;
import com.caicai.joke.domain.RestReturnDTO;
import com.caicai.joke.services.JokeService;
import com.caicai.joke.utils.HttpUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author caic
 * @description
 * @see
 * @since
 */
@Service
public class JokeServiceImpl implements JokeService {

    @Override
    public Joke getJoke(String type){
        RestTemplate restTemplate=new RestTemplate();
        RestReturnDTO<List<LinkedHashMap>> result = restTemplate.getForObject("https://api.apiopen.top/getJoke?type="+type+"&count=1", RestReturnDTO.class);
        if(result.getCode()!=200){
            System.out.println("接口调用异常");
        }
        Joke joke= new Joke();
        try {
            BeanUtils.populate(joke,result.getResult().get(0));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        if("image".equals(type)){
            if(!HttpUtils.exist(joke.getImages())){
                System.out.println("图片url无法访问");
            }
        }
        if("video".equals(type)){
            if(!HttpUtils.exist(joke.getVideo())){
                System.out.println("视频url无法访问");
            }
        }
        return joke;
    }
}
