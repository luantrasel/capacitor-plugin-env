import Foundation

@objc public class CapacitorEnv: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
