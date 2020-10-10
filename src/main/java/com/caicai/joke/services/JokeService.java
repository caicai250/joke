package com.caicai.joke.services;

import com.caicai.joke.domain.Joke;

import java.lang.reflect.InvocationTargetException;

/**
 * @author caic
 * @description 段子服务
 * @see
 * @since
 */
public interface JokeService {
    Joke getJoke(String type);
}
