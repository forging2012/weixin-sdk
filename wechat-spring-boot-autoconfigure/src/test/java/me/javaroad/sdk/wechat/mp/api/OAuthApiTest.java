package me.javaroad.sdk.wechat.mp.api;

import static org.assertj.core.api.Assertions.assertThat;

import me.javaroad.sdk.wechat.BaseSpringTest;
import me.javaroad.sdk.wechat.mp.model.AccessTokenResponse;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author heyx
 */
public class OAuthApiTest extends BaseSpringTest {

    @Autowired
    private OAuthApi authApi;

    @Test
    public void getAccessToken() throws Exception {
        AccessTokenResponse response = authApi.getAccessToken();
        assertThat(response).isNotNull();
    }

}