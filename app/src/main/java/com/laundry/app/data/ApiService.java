package com.laundry.app.data;

import com.laundry.app.dto.addressaccount.AddressRegisteredResponse;
import com.laundry.app.dto.authentication.LoginRequest;
import com.laundry.app.dto.authentication.LoginResponseDto;
import com.laundry.app.dto.authentication.RegisterRequest;
import com.laundry.app.dto.authentication.RegisterResponse;
import com.laundry.app.dto.ordercreate.OrderRequest;
import com.laundry.app.dto.ordercreate.OrderResponse;
import com.laundry.app.dto.ordercreate.OrderServiceDetailForm;
import com.laundry.app.dto.servicelist.ServiceListResponse;
import com.laundry.app.dto.sevicedetail.ServicesDetailResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiService {

    @POST(APIConstant.URL_SIGNUP)
    Call<RegisterResponse> signup(@Body RegisterRequest body);

    @POST(APIConstant.URL_LOGIN)
    Call<LoginResponseDto> signin(@Body LoginRequest loginRequest);

    @GET(APIConstant.URL_SERVICES_ALL)
    Call<ServiceListResponse> getServicesAll();

    @POST(APIConstant.URL_SERVICES_DETAILS)
    @FormUrlEncoded
    Call<ServicesDetailResponse> getServicesDetail(@Field("serviceId") int id);

    @POST(APIConstant.URL_ORDERS_CONFIRM)
    Call<OrderResponse> orderConfirm(@Header("Authorization") String token, @Body List<OrderServiceDetailForm> body);

    @POST(APIConstant.URL_ORDERS_CREATE)
    Call<OrderResponse> createOrder(@Header("Authorization") String token, @Body OrderRequest body);

    @GET(APIConstant.URL_ADDRESS_ALL)
    Call<AddressRegisteredResponse> getAddress(@Header("Authorization") String token);
}
