package com.its.SpringMvcJsonMapperConfig.config;

/*import com.google.gson.Gson;
import com.google.gson.GsonBuilder;*/
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import com.owlike.genson.ext.spring.GensonMessageConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;
import java.util.function.Consumer;

@Configuration
@Slf4j
public class ApplicationConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        log.info("## Entering ApplicationConfig : configureMessageConverters");
        //converters.add(customGsonHttpMessageConverter());
        converters.add(customGensonMessageConverter());
        log.info("Leaving ApplicationConfig : configureMessageConverters");
        //super.configureMessageConverters(converters);
    }

    /*private GsonHttpMessageConverter customGsonHttpMessageConverter() {
        log.info("1 Entering ApplicationConfig : customGsonHttpMessageConverter");

        Gson gson = new GsonBuilder()
                //.excludeFieldsWithoutExposeAnnotation()
                //.setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'")
                .create();

        GsonHttpMessageConverter gsonMessageConverter = new GsonHttpMessageConverter();
        gsonMessageConverter.setGson(gson);

        log.info("Leaving ApplicationConfig : customGsonHttpMessageConverter");
        return gsonMessageConverter;
    }*/

    private GensonMessageConverter customGensonMessageConverter() {
        log.info("2 Entering ApplicationConfig : customGensonMessageConverter");
        Genson genson = new GensonBuilder()
                                .create();
        GensonMessageConverter gensonMessageConverter = new GensonMessageConverter();
        log.info("Leaving ApplicationConfig : customGensonMessageConverter");
        return gensonMessageConverter;
    }
}
