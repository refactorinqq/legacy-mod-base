package dev.refactoring.mod

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

class ExampleMod : ModInitializer {
    override fun onInitialize() {
        logger.info("hello, fabric")
        logger.info("id: $ID")
        logger.info("name: $NAME")
    }

    companion object {
        const val ID = "example"
        const val NAME = "Example"

        @JvmStatic val logger: Logger = LogManager.getLogger("ExampleMod")
    }
}