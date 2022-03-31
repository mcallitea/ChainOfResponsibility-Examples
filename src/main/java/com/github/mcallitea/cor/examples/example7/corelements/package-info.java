// The usage of staticInitializerMethod is optional. If not present, an empty constructor is expected.
@CorPackage({
        @CorType(value = Element1.class, order = 1, staticInitializerMethod = "init"),
        @CorType(value = Element2.class, order = 2, staticInitializerMethod = "init"),
        @CorType(value = Element3.class, order = 3, staticInitializerMethod = "init")
})
package com.github.mcallitea.cor.examples.example7.corelements;

import com.github.mcallitea.cor.api.annotation.CorPackage;
import com.github.mcallitea.cor.api.annotation.CorType;