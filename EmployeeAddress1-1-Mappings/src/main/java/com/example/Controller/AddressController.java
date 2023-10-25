package com.example.Controller;

import com.example.Entity.Address;
import com.example.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("addresses")
    public Iterable<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    @GetMapping("address/id/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }
    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @PutMapping("address/id/{id}/street/{street}")
    public String updateAddressById(@PathVariable Long id , @PathVariable String street){
        return addressService.updateAddressById(id , street);
    }

    @DeleteMapping("address/id/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }

}