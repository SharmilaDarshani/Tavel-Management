package lk.ijse.travelAgent.Controller;

import lk.ijse.travelAgent.Service.PassengerService;
import lk.ijse.travelAgent.dto.PassengerDTO;
import lk.ijse.travelAgent.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("passenger")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;
    @PostMapping("/add")
    public void addPassenger(@RequestBody PassengerDTO passengerDTO){
        passengerService.savePassenger(passengerDTO);
    }
    @GetMapping("/all")
    public List<PassengerDTO> getAll(){
        return passengerService.getAllPassengers();
    }

    @PutMapping("/update")
    public void updatePassenger(@RequestBody PassengerDTO passengerDTO){
        passengerService.updatePassenger(passengerDTO);
    }

    @GetMapping("/find/{id}")
    public Passenger searchPassenger(@PathVariable Integer passID){
        return passengerService.searchPassenger(passID);

    }
    @DeleteMapping("/delete/{id}")
    public void deletePassenger(@PathVariable Integer passID){
        passengerService.deletePassenger(passID);
    }
}
