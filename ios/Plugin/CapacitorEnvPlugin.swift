import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(CapacitorEnvPlugin)
public class CapacitorEnvPlugin: CAPPlugin {
    private let implementation = CapacitorEnv()

    @objc func echo(_ call: CAPPluginCall) {
        let value = call.getString("value") ?? ""
        call.resolve([
            "value": implementation.echo(value)
        ])
    }
    
    @objc func get(_ call: CAPPluginCall) {
        let config = getConfig() as PluginConfig
        let json = config.getConfigJSON()
        call.resolve(json)
    }
}
