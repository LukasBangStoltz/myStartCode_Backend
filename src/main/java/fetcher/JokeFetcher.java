/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fetcher;

import com.google.gson.Gson;
import dto.SWJokeDTO;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import utils.HttpUtils;

public class JokeFetcher {

    private static final String JOKE_URL = "http://swquotesapi.digitaljedi.dk/api/SWQuote/RandomStarWarsQuote";

    public static String jokeResponseParrallel(ExecutorService threadpool, Gson gson) throws InterruptedException, ExecutionException, TimeoutException {

        Callable<SWJokeDTO> jokeTask = new Callable<SWJokeDTO>() {
            @Override
            public SWJokeDTO call() throws Exception {
                String joke = HttpUtils.fetchData(JOKE_URL);
                SWJokeDTO swJokeDTO = gson.fromJson(joke, SWJokeDTO.class);

                return swJokeDTO;
            }
        };
        Future<SWJokeDTO> futureJoke = threadpool.submit(jokeTask);
        SWJokeDTO jokeDTO = futureJoke.get(2, TimeUnit.SECONDS);

        String jokeGson = gson.toJson(jokeDTO);

        return jokeGson;

    }
}
