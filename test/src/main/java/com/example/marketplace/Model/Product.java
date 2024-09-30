package com.example.marketplace.Model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

//import java.util.stream.Stream;
@Data
@Builder
public class Product
{

    private String Name_p;
    private String Description_p;
    private String Type;
    @NonNull
    private String Unic_key_p;
    private String Price;


}
