package eu.depau.ddroid

import android.net.Uri
import eu.depau.ddroid.abc.WizardFragment
import eu.depau.ddroid.values.FlashMethod
import eu.depau.ddroid.values.ImageLocation
import eu.depau.ddroid.values.WizardStep

object StateKeeper {
    var wizardStep: WizardStep = WizardStep.SELECT_FLASH_METHOD
    var currentFragment: WizardFragment? = null
    var flashMethod: FlashMethod? = null
    var imageLocation: ImageLocation? = null
    var streamingWrite: Boolean = false
    var imageFile: Uri? = null
}