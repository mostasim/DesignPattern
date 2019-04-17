package creational.builder_assembler

import java.io.File

fun main() {
    val dialog: Dialog = dialog {
        title {
            text = "Dialog Title"
        }
        message {
            text = "Dialog Message"
            color = "#333333"
        }
        image {
            File.createTempFile("image", "jpg")
        }
    }

    dialog.show()
}
//Function that creates dialog builder and builds Dialog
fun dialog(init: DialogBuilder.() -> Unit): Dialog {
    return DialogBuilder(init).build()
}


