package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarDAO carDao;

    @Autowired
    public CarServiceImpl(CarDAO carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getFixNumberOfCars(int numb) {
        if (numb > carDao.getCars().size()) {
            return carDao.getCars();
        }
        return carDao.getCars().subList(0, numb);
    }

}
