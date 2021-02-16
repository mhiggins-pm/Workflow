/*
 * Book API (w/ actions)
 * API for tracking your books, authors and pub-dates.
 *
 * OpenAPI spec version: 1.1.0
 * Contact: micheal.higgins@smartbear.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorModel;
import io.swagger.client.model.InlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookApi
 */
@Ignore
public class BookApiTest {

    private final BookApi api = new BookApi();

    /**
     * 
     *
     * List the books
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bookGetTest() throws ApiException {
        InlineResponse200 response = api.bookGet();

        // TODO: test validations
    }
}
