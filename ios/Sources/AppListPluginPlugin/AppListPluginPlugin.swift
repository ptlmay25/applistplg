import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(AppListPluginPlugin)
public class AppListPluginPlugin: CAPPlugin, CAPBridgedPlugin {
    public let identifier = "AppListPluginPlugin"
    public let jsName = "AppListPlugin"
    public let pluginMethods: [CAPPluginMethod] = [
        CAPPluginMethod(name: "echo", returnType: CAPPluginReturnPromise),
        CAPPluginMethod(name: "getInstalledApps", returnType: CAPPluginReturnPromise)
    ]

    @objc func echo(_ call: CAPPluginCall) {
        let value = call.getString("value") ?? ""
        call.resolve([
            "value": value
        ])
    }

    @objc func getInstalledApps(_ call: CAPPluginCall) {
        call.unimplemented("Not available on iOS")
    }
}