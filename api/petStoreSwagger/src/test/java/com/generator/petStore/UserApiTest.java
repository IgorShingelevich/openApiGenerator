/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.6
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.generator.petStore;


import base.BasePetstoreApiTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openapitools.client.api.petStoreApi.UserApi;
import org.openapitools.client.model.petStoreModel.User;

import java.util.List;

@Tag("base")
@Epic("setEpic")
@Feature("setFeature")
@Story("setStory")
@Disabled
/**
 * API tests for UserApi
 */
public class UserApiTest extends BaseTest {
    private UserApi api = userApi;

    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterCreateUser() {
        User body = null;
        api.createUser()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterCreateUsersWithArrayInput() {
        List<User> body = null;
        api.createUsersWithArrayInput()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterCreateUsersWithListInput() {
        List<User> body = null;
        api.createUsersWithListInput()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid username supplied
     */
    @Test
    public void shouldSee400AfterDeleteUser() {
        String username = null;
        api.deleteUser()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not found
     */
    @Test
    public void shouldSee404AfterDeleteUser() {
        String username = null;
        api.deleteUser()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterGetUserByName() {
        String username = null;
        api.getUserByName()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid username supplied
     */
    @Test
    public void shouldSee400AfterGetUserByName() {
        String username = null;
        api.getUserByName()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not found
     */
    @Test
    public void shouldSee404AfterGetUserByName() {
        String username = null;
        api.getUserByName()
                .usernamePath(username).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterLoginUser() {
        String username = null;
        String password = null;
        api.loginUser()
                .usernameQuery(username)
                .passwordQuery(password).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid username/password supplied
     */
    @Test
    public void shouldSee400AfterLoginUser() {
        String username = null;
        String password = null;
        api.loginUser()
                .usernameQuery(username)
                .passwordQuery(password).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee0AfterLogoutUser() {
        api.logoutUser().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid user supplied
     */
    @Test
    public void shouldSee400AfterUpdateUser() {
        String username = null;
        User body = null;
        api.updateUser()
                .usernamePath(username)
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not found
     */
    @Test
    public void shouldSee404AfterUpdateUser() {
        String username = null;
        User body = null;
        api.updateUser()
                .usernamePath(username)
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}