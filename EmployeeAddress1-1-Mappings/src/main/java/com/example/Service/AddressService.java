package com.example.Service;

import com.example.Entity.Address;
import com.example.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public Iterable<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepo.findById(id);
    }

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address added successfully..";
    }

    public String updateAddressById(Long id, String street) {
        Optional<Address> optional = addressRepo.findById(id);

        if(optional.isPresent()){
            Address address = optional.get();
            address.setStreet(street);
            addressRepo.save(address);
        }else{
            return "Id not found..";
        }
        return "Address added successfully..";
    }

    public String deleteAddressById(Long id) {
        addressRepo.deleteById(id);
        return "Address deleted successfully..";
    }
}