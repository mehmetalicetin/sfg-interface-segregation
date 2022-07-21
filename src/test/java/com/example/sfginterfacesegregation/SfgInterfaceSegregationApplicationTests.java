package com.example.sfginterfacesegregation;

import com.example.sfginterfacesegregation.with.ToyBuilder;
import com.example.sfginterfacesegregation.with.ToyCar;
import com.example.sfginterfacesegregation.with.ToyHouse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SfgInterfaceSegregationApplicationTests {

    @Test
    public void testBuildToyHouse() throws Exception {
        ToyHouse toyHouse= ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }

    @Test
    public void testBuildToyCar() throws Exception {
        ToyCar toyCar=ToyBuilder.buildToyCar();;
        System.out.println(toyCar);
    }


}
