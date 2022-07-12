package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void addCars(Car car);

    User getUserByCars (String model, int series);
    List<User> listUsers();
}
